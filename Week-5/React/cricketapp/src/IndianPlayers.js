import React from 'react';

// Destructuring odd players from the array
export function OddPlayers([first, , third, , fifth]) {
    return (
        <div>
            <li>First : {first}</li>
            <li>Third : {third}</li>
            <li>Fifth : {fifth}</li>
        </div>
    );
}

// Destructuring even players from the array
export function EvenPlayers([, second, , fourth, , sixth]) {
    return (
        <div>
            <li>Second : {second}</li>
            <li>Fourth : {fourth}</li>
            <li>Sixth : {sixth}</li>
        </div>
    );
}

// Arrays to merge
const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

// Merging arrays using the spread operator
export const IndianPlayersMerged = [...T20Players, ...RanjiTrophyPlayers];

export const ListOfIndianPlayers = ({ IndianPlayers }) => {
    return (
        <div>
            {IndianPlayers.map((player, index) => (
                <li key={index}>Mr. {player}</li>
            ))}
        </div>
    );
};