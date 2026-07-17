import {CalculateScore} from './Components/CalculateScore';

function App()
{
    return(
        <div>
            <CalculateScore Name={"Saksham"} 
            School={"VIT Bhopal University"} 
            total={300} 
            goal={3} 
            />
        </div>
    )
}

export default App;