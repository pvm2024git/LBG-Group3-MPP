import { useState } from 'react';
 
const ChangeState = () => {
 
    const [fullName, setFullName] = useState("Jordan Benbelaid");
 
    return (
        <>
            <h1>{fullName}</h1>
            <button onClick={() => (setFullName("Piers Barber"))}>
                Change Name here!
            </button>
        </>
    );
}
 
export default ChangeState;