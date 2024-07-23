import { useState } from "react";

export const AddTask = ({ onAddTodo }) => {
  const [title, setTitle] = useState("");
  return (
    <>
      <input
        placeholder="Agregar tarea"
        value={title}
        onChange={(e) => setTitle(e.target.value)}
      />
      <button
        onClick={() => {
          setTitle("");
          onAddTodo(title);
        }}
      >
        Añadir
      </button>
    </>
  );
};
