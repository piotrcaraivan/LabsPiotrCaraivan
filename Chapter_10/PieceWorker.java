class PieceWorker extends Employee {
    private double wagePerPiece;
    private int piecesProduced;

    public PieceWorker(String name, String position, double wagePerPiece, int piecesProduced) {
        super(name, position);
        this.wagePerPiece = wagePerPiece;
        this.piecesProduced = piecesProduced;
    }

    @Override
    public double earnings() {
        return wagePerPiece * piecesProduced;
    }
}
