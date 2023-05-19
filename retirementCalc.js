import RetireLib from './RetireLib.js';

new Vue({
    el: '#app',
    data: {
        calculations: [
        "Single payment compound amount (F/P, i, N)",
        "Single payment present worth (P/F, i, N)",
        "Uniform series compound amount (F/A, i, N)",
        "Uniform series present worth (P/A, i, N)",
        "Sinking fund (A/F, i, N)",
        "Capital recovery (A/P, i, N)",
        "Arithmetic gradient present worth (P/G, i, N)",
        "Arithmetic gradient worth per amount (A/G, i, N)",
        "Uniform arithmetic gradient present worth (P/A + P/G, i, N)",
        "Geometric gradient present worth (P/A,f, i, N)"
        ],
        selectedCalculation: null,
        inputP: 0,
        inputF: 0,
        inputI: 0,
        inputA: 0,
        inputN: 0,
        inputG: 0,
        inputf: 0,
        output: null,
        inputPValues: [0, 2, 3, 5],
        inputFValues: [1, 4],
        inputIValues: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9],
        inputAValues: [8, 9],
        inputNValues: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9],
        inputGValues: [6, 7, 8],
        inputfValues: [9]
    },
    methods: {
        calculate() {
        const response = parseInt(this.selectedCalculation);
        const P = parseFloat(this.inputP);
        const F = parseFloat(this.inputF);
        const i = parseFloat(this.inputI);
        const A = parseFloat(this.inputA);
        const N = parseInt(this.inputN);
        const G = parseFloat(this.inputG);
        const f = parseFloat(this.inputf);

        i = i / 100;
        f = f / 100;

        switch (response) {
            case 0:
                this.output = RetireLib.FP(P, i, N);
                break;
            case 1:
                this.output = RetireLib.PF(F, i, N);
                break;
            case 2:
                this.output = RetireLib.FA(P, i, N);
                break;
            case 3:
                this.output = RetireLib.PA(P, i, N);
                break;
            case 4:
                this.output = RetireLib.AF(F, i, N);
                break;
            case 5:
                this.output = RetireLib.AP(P, i, N);
                break;
            case 6:
                this.output = RetireLib.PG(G, i, N);
                break;
            case 7:
                this.output = RetireLib.AG(G, i, N);
                break;
            case 8:
                this.output = RetireLib.PAG(A, G, i, N);
                break;
            case 9:
                this.output = RetireLib.PGGeo(A, i, N, f);
                break;
            case 10:
                this.output = null;
                break;
            default:
                break;
        }
        
        }
    }
    });