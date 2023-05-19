class RetirementCalculator {
    static main() {
      const order = [
        "F/P",
        "P/F",
        "F/A",
        "P/A",
        "A/F",
        "A/P",
        "P/G",
        "A/G",
        "Present Arithmetic Gradient (P/A and P/G)",
        "Present Geometric Gradient"
      ];
  
      let P = 0;
      let F = 0;
      let i = 0;
      let A = 0;
      let N = 0;
      let G = 0;
      let f = 0;
      let output = 0;
      console.log(f % 0.2);
  
      let cont = true;
      while (cont) {
        console.log("What would you like to calculate today?");
  
        for (let j = 0; j < 10; j++) {
          console.log(j + ": " + order[j]);
        }
        console.log("10: End the program. ");
  
        const response = parseInt(prompt("Enter your choice:"));
        if (response === 10) {
          console.log("Thank you for using this program!");
          cont = false;
          break;
        } else if (response === 0) {
          P = parseFloat(prompt("Please input P."));
          i = parseFloat(prompt("Please input i as a decimal."));
          N = parseInt(prompt("Please input N."));
          output = RetireLib.FP(P, i, N);
        } else if (response === 1) {
          F = parseFloat(prompt("Please input F."));
          i = parseFloat(prompt("Please input i as a decimal."));
          N = parseInt(prompt("Please input N."));
          output = RetireLib.PF(F, i, N);
        } else if (response === 2) {
          A = parseFloat(prompt("Please input A."));
          i = parseFloat(prompt("Please input i as a decimal."));
          N = parseInt(prompt("Please input N."));
          output = RetireLib.FA(A, i, N);
        } else if (response === 3) {
          A = parseFloat(prompt("Please input A."));
          i = parseFloat(prompt("Please input i as a decimal."));
          N = parseInt(prompt("Please input N."));
          output = RetireLib.PA(A, i, N);
        } else if (response === 4) {
          F = parseFloat(prompt("Please input F."));
          i = parseFloat(prompt("Please input i as a decimal."));
          N = parseInt(prompt("Please input N."));
          output = RetireLib.AF(F, i, N);
        } else if (response === 5) {
          // AP
        } else if (response === 6) {
          // PG
        } else if (response === 8) {
          // AG
        } else if (response === 9) {
          // PAG
        } else if (response === 10) {
          // PGGeo
        } else {
          console.log("Invalid input. Please try again.");
        }
      }
    }
  }
  
  RetirementCalculator.main();
  