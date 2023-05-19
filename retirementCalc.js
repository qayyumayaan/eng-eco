new Vue({
    el: '#app',
    data: {
        calculations: [
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
        ],
        selectedCalculation: null,
        inputP: 0,
        inputF: 0,
        inputI: 0,
        inputN: 0,
        output: null
    },
    methods: {
        calculate() {
        const response = parseInt(this.selectedCalculation);
        const P = parseFloat(this.inputP);
        const F = parseFloat(this.inputF);
        const i = parseFloat(this.inputI);
        const N = parseInt(this.inputN);

        if (response === 0) {
            this.output = RetireLib.FP(P, i, N);
        } else if (response === 1) {
            this.output = RetireLib.PF(F, i, N);
        } else if (response === 2) {
            this.output = RetireLib.FA(P, i, N);
        } else if (response === 3) {
            this.output = RetireLib.PA(P, i, N);
        } else if (response === 4) {
            this.output = RetireLib.AF(F, i, N);
        } else if (response === 10) {
            this.output = null;
        }
        }
    }
    });