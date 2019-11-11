const totalSteps = (staircase: number[], stepsPerFlight: number) =>
    staircase.reduce((acc, curr) => acc + Math.ceil(curr/stepsPerFlight), 0)
    + (staircase.length - 1) * 2

console.log(totalSteps([15], 2));
console.log(totalSteps([15, 15], 2));
console.log(totalSteps([5, 11, 9, 13, 8, 30, 14], 3));
