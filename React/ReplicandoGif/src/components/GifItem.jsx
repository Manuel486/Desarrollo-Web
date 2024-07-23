import React from 'react'
import { Figure } from 'react-bootstrap'

export const GifItem = ({title,url}) => {
  return (
    <div>
      <Figure.Image
        width='auto'
        alt={title}
        src={url} 
      ></Figure.Image>
      {/* <img src={url} alt={title} /> */}
      {/* <p>{title}</p> */}
    </div>
  )
}

