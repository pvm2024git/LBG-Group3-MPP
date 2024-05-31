import { useState } from 'react';

const SellerForm = () => {
    const [first, setFirst] = useState('');
    const [last, setLast] = useState('');

    const handlesubmit = (e) => {
        e.preventDefault();
        const seller = { first, last }

        fetch('http://localhost:8000/sellers',
        {
            method: 'POST',
            headers: { "Content-Type" : "application/json" },
            body: JSON.stringify(seller)
        })
        
        setFirst('');
        setLast('');
        
    }

    return (
        <form onSubmit={handlesubmit}>
            <label>First Name: </label>
            <input type="text"
            required value={first}
            onChange={(e) => setFirst(e.target.value)} />

            <br /><br />

            <label>Surname: </label>
            <input type="text"
            required value={last}
            onChange={(e) => setLast(e.target.value)} />

            <br /><br />
{/* 
            <label>Title:</label>
            <select
            value={title}
            onChange={(e) => setTitle(e.target.value)} >
                <option value="mr">Mr</option>
                <option value="mrs">Mrs</option>
            <option value="dr">Dr</option>
            </select>

            <br /> */}

            <button>Register</button>


        </form>
    )

}
export default SellerForm;