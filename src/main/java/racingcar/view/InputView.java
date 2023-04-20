package racingcar.view;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String CAR_NAME_SEPARATOR = ",";

    public List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        final String input = SCANNER.nextLine();
        final String[] carNames = input.split(CAR_NAME_SEPARATOR);
        return trim(List.of(carNames));
    }

    private List<String> trim(final List<String> carNames) {
        return carNames.stream()
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public int inputTrialCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int input = SCANNER.nextInt();
        SCANNER.nextLine();
        return input;
    }
}
