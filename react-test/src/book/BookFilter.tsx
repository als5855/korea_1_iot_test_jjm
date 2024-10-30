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


  return (
    <div>
      <input 
        type="text"

        placeholder='Enter Category'
        required
      />

      <ul>
 
      </ul>
    </div>
  )
}
