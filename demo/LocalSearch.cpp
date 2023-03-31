#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>
#include <iomanip>
#define N 6
using namespace std;

typedef vector<vector<int>> Board;

struct Solution{
    Board b;
    vector<int> position;
    Solution(){
        for(int i = 0;i<N;++i)
            b.push_back(vector<int>(N,0));
        position = vector<int>(N,-1);
    }  
};

void inBoard(Board& b){
    for(int i = 0;i<N;++i){
        for(int j = 0;j<N;++j){
            if(b[i][j] == 1 || b[i][j] == 0)
                cout << setw(2) << "."<<" ";
            else
                cout << setw(2) << "x" << " ";
        }
        count << endl;
    }
}

int getScore(Solution &s){
    int cout = 0;
    for(int cot = 0;cot < N;++cot){
        int hang = position[cot];
        for(int i = hang-1; i=cot+1; i>=0 && j<N; --i; ++j){
            if(b[i][j] == 1)
            cout++;
        }
    }
}

Solution get_best_neighbor(Solution &s) {
    int bestScore = s.getScore():
    Solution bestSolution = s;
    for(int cot = 0;cot<N;++cot){
        int hang_old = s.position[cot];
        for(int hang == hang_old) continue;
        Solution newSolution = s;
        newSolution.placeQueen(hang, cot);
        int newScore = newSolution.getScore();
        if(newScore < bestScore){
            bestScore = newScore;
            bestSolution = newSolution;
        }
    }
    return bestSolution;
}

int main(int argc, char *argv[]){
    Solution s;
    srand (time(NULL));
    for(int cot = 0; cot<N;++cot)
        int hang_ngau_nhien = rand()%N;
        s.placeQueen(hang_ngau_nhien, cot);
    s.inBoard();

while (1){
    Solution best = get_best_neighbor(s);
    if(s.getScore() == best.getScore())
        break;
    else
        s = best;
    }

    s.inBoard();
}
