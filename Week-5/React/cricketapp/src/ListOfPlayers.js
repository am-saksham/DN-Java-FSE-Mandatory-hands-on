import React from 'react';

// Component mapping all players
export const ListOfPlayers = ({ players }) => {
    return (
        <div>
            {players.map((item, index) => {
                return (
                    <div key={index}>
                        <li>Mr. {item.name} <span>{item.score}</span></li>
                    </div>
                );
            })}
        </div>
    );
};

// Component filtering players with score <= 70
export const ScoreBelow70 = ({ players }) => {
    let players70 = [];
    
    players.map((item) => {
        if (item.score <= 70) {
            players70.push(item);
        }
        return null; // map requires a return
    });

    return (
        <div>
            {players70.map((item, index) => (
                <div key={index}>
                    <li>Mr. {item.name} <span>{item.score}</span></li>
                </div>
            ))}
        </div>
    );
};