import React, { useState } from 'react'
import axios from 'axios';
const DOMAIN = 'http://localhost:8081';
const MENU_API = 'api/v1/';

interface GetBookCategoryResponseDto {
  book_title: string;
  book_author: string;
  book_category: string
}

export default function BookFilter() {
  const [category, setCategory] = useState<string>('');
  const [results, setRusults] = useState<GetBookCategoryResponseDto[]>([]);

  const handleCategoryChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setCategory(e.target.value);
  }

  const fetchMenuButtonData = async (book_category: string) => {
    if (book_category.trim()) {
      try {
        const response = await axios.get(
          `${DOMAIN}/${MENU_API}/search/book_category`,
          { params: { book_category }}
        );

        const data = response.data.data;
        setRusults(data);

      } catch (error) {
        console.log("Error fetching data: ", error);
      }
    }
  }
  return (
    <div>
      <input 
        type="text"
        value={category}
        onChange={handleCategoryChange}  
        placeholder='Enter Category'
        required
      />

      <ul>
        {results.map((result, index) => (
          <li key={index}>{result.book_category}</li>
        ))}
      </ul>
    </div>
  )
}
