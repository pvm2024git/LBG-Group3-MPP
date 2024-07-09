import { useState } from 'react';

const BookingForm = () => {
    const [propertyId, setPropertyId] = useState('');
    const [buyerId, setBuyerId] = useState('');

    const handlesubmit = (e) => {
        e.preventDefault();
        const booking = { propertyId, buyerId }

        // fetch('http://localhost:8001/bookings/create',
        fetch('http://localhost:8000/bookings',
        {
            method: 'POST',
            headers: { "Content-Type" : "application/json" },
            body: JSON.stringify(booking)
        })
        
        setPropertyId('');
        setBuyerId('');
            
    }

    return (
        <div>
        <form onSubmit={handlesubmit} className= "bookingform">
            <label>Property ID: </label>
            <input type="text"
            required value={propertyId}
            onChange={(e) => setPropertyId(e.target.value)} />

            <br /><br />

            <label>Buyer ID: </label>
            <input type="text"
            required value={buyerId}
            onChange={(e) => setBuyerId(e.target.value)} />

            <br /><br />
            <div className='bookingbutton'>
            <button>Book</button>
            </div>

        </form>
        
        
        </div>

    )

    

    

}
export default BookingForm;