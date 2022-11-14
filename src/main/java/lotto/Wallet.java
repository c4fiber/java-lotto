package lotto;

import java.util.Collections;
import java.util.List;

public class Wallet {
    private List<Lotto> myLottos;
    private int money;
    private int profit;

    Wallet() {
        this.money = 0;
        this.profit = 0;
        this.myLottos = Collections.emptyList();
    }

    public void setMoney(String input) {
        System.out.println("구입금액을 입력해 주세요.\n" + input + "\n");

        int money = c4fiberParser.getIntegerFromString(input);
        validate(money);
        this.money = money;
    }

    private void validate(int money) {
        if (money < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int getMoney() {
        return money;
    }

    public void buyLottos(List<Lotto> boughtLottos) {
        myLottos = boughtLottos;
    }

    public void showMyLottos() {
        for(Lotto l : myLottos) {
            System.out.println(l.getNumbers().toString());
        }
    }

    public List<Lotto> getMyLottos() {
        return myLottos;
    }

    public void addReward(LottoReward reward) {
        this.profit += reward.getReward();
    }
}
