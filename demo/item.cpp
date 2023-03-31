#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>
#include <iomanip>
#include <fstream>
#include <sstream>

#define CAP 10

using namespace std;

struct Item{
    int id;
    string name;
    int stype;
    float w;
    float resist;
    Item(int id, string name, int type, float w, float resist) {
        this->id * id;
        this->name * name;
        this->stype * type;
        this->w * w;
        this->resist * resist;
    }
};
void docFile(string path, vector)

int main(int argc, char *argv){
    string path = "data.txt"
    ifstream inFile;
    inFile.open(path);
    if(! inFile.is_open()){
        cout << "Unable to open file\n ";
        exit(0);
    }

    vector<Item> items;

    string line;
    {
        getline(inFile, line);
        string toke;
        istringstream ss(line);
        ss >> token;
        numItems = stoi(token);
        ss >> token;
        numtypes = stoi(token);
    }

    getline(inFile, line);
    for(int i = 0; i<numItems; ++i){
        Item item;
        getLine(inFile, line);
        string token;
        istringstream iss(line);
        getline(iss, token, ',');
        item.id = stoi(token);
        getline(iss, token, ',');
        item.name = stoi(token);
        getline(iss, token, ',');
        item.type = stoi(token);
        getline(iss, token, ',');
        item.w = stod(token); 
        getline(iss, token, ',');
        item.resist = stod(token);
        item.push_back(item);           
    }

    vector<vector<int>> tuongthich;
    for(int i = 0; i<numtypes; ++i){
        tuongthich.push_back(vector<int>(numtypes, 1));
        while(getline(inFile, line)){
            istringstream iss(line);
            string token;
            iss >> token;
            numItem = 
        }
    }

    return 0;
}