import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] yildizbas=new String[16][7];
        for (int i = 0; i< yildizbas.length;i++){
            for (int j =0 ;j< yildizbas[i].length;j++){
                if (j==0){
                    yildizbas[i][j]=" * ";
                }else if (i == 0 & j < 6 ){
                    yildizbas[i][j]=" * ";
                }else if (j == 6 & i != 0 & i != 7 & i != 8 & i != 15){
                    yildizbas[i][j]=" * ";
                } else if (i == 7 || i == 8 & j<6) {
                    yildizbas[i][j]=" * ";
                } else if (i == 15 & j< 6) {
                    yildizbas[i][j]=" * ";
                } else {
                    yildizbas[i][j]="   ";
                }

            }
        }
        for (String [] row:yildizbas){
            for (String column : row){
                System.out.print(column);
            }
            System.out.println();
        }

    }


}