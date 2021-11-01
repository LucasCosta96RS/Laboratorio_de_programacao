package AP2;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Lê os inputs do teclado e retorna uma informação, usar Teclado.entrada = false, se quiser utilizar JOptionPane no lugar de Scanner
 * */
public class Teclado {


    private static final Scanner tc = new Scanner(System.in);
    private static String numero;
    private static char caracter;
    public static boolean entrada = true;       // Escolhe o tipo de entrada do usuário: Scanner = true, JOptionPane = false
    private static final Pattern padrao_de_email = Pattern.compile("^[_a-zA-Z0-9-]+@[a-zA-Z0-9-]+\\.*[a-zA-Z]{2,}+\\.*[a-zA-Z]{2,}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern padrao_de_telefone = Pattern.compile("^[1-9]{2}[-][9]?[0-9]{8}$");
    private static final Pattern padrao_de_data = Pattern.compile("^([0-9]{2})[/]([0-9]{2})[/]([0-9]{4})$");

    /**
     * Mostra uma mensagem predeterminada e lê uma string
     * @return String
     * */
    public String lerString() {
        if (entrada) {
            System.out.println("Digite uma frase: ");
            return tc.nextLine();
        } else {
            return Objects.requireNonNullElse(JOptionPane.showInputDialog("Digite uma frase: "), "0");
        }
    }

    /**
     * Mostra uma mensagem determinada e lê uma string
     * @param msg Mensagem a ser colocada para o usuário
     * @return String
     * */
    public String lerString(String msg) {
        if (entrada) {
            System.out.println(msg);
            return tc.nextLine();
        } else {
            return Objects.requireNonNullElse(JOptionPane.showInputDialog(msg), "0");
        }
    }

    /**
     * Mostra uma mensagem predeterminada e lê um número flutuante
     * @return float
     * */
    public float lerFloat() {
        if (entrada) {
            System.out.println("Digite um número flutuante: ");
            while (!tc.hasNextFloat()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextFloat());
            return Float.parseFloat(numero);
        } else {
            float converterParaFloat;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog("Digite um número flutuante: ").trim();
                    converterParaFloat = Float.parseFloat(numero);
                    return converterParaFloat;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem determinada e lê um número flutuante
     * @param msg Mensagem a ser colocada para o usuário
     * @return float
     * */
    public float lerFloat(String msg) {
        if (entrada) {
            System.out.println(msg);
            while (!tc.hasNextFloat()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextFloat());
            return Float.parseFloat(numero);
        } else {
            float converterParaFloat;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog(msg).trim();
                    converterParaFloat = Float.parseFloat(numero);
                    return converterParaFloat;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada e lê um número double
     * @return double
     * */
    public double lerDouble() {
        if (entrada) {
            System.out.println("Digite um número Double: ");
            while (!tc.hasNextDouble()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextDouble());
            return Double.parseDouble(numero);
        } else {
            double converterParaDouble;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog("Digite um número Double: ").trim();
                    converterParaDouble = Double.parseDouble(numero);
                    return converterParaDouble;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem determinada e lê um número double
     * @param msg Mensagem a ser colocada para o usuário
     * @return double
     * */
    public double lerDouble(String msg) {
        if (entrada) {
            System.out.println(msg);
            while (!tc.hasNextDouble()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextDouble());
            return Double.parseDouble(numero);
        } else {
            double converterParaDouble;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog(msg).trim();
                    converterParaDouble = Double.parseDouble(numero);
                    return converterParaDouble;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada e lê um número inteiro
     * @return int
     * */
    public int lerInt() {
        if (entrada) {
            System.out.println("Digite um número inteiro: ");
            while (!tc.hasNextInt()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextInt());
            return Integer.parseInt(numero);
        } else {
            int converterParaInt;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog("Digite um número inteiro: ").trim();
                    converterParaInt = Integer.parseInt(numero);
                    return converterParaInt;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem determinada e lê um número inteiro
     * @param msg Mensagem a ser colocada para o usuário
     * @return int
     * */
    public int lerInt(String msg) {
        if (entrada) {
            System.out.println(msg);
            while (!tc.hasNextInt()) {
                tc.next();
                System.out.println("Apenas números permitidos, digite novamente.");
            }
            numero = String.valueOf(tc.nextInt());
            return Integer.parseInt(numero);
        } else {
            int converterParaInt;
            while (true) {
                try {
                    numero = JOptionPane.showInputDialog(msg).trim();
                    converterParaInt = Integer.parseInt(numero);
                    return converterParaInt;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas números permitidos, digite novamente.");
                } catch (NullPointerException e) {
                    return 0;
                }
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada e lê um carácter
     * @return char
     * */
    public char lerChar() {
        if (entrada) {
            try {
                System.out.println("Digite um Carácter: ");
                caracter = tc.next().charAt(0);
                tc.nextLine();
                return caracter;
            } catch (NullPointerException | StringIndexOutOfBoundsException e) {
                return "0".charAt(0);
            }
        } else {
            try {
                return JOptionPane.showInputDialog("Digite um carácter: ").trim().charAt(0);
            } catch (NullPointerException | StringIndexOutOfBoundsException e) {
                return "0".charAt(0);
            }
        }
    }

    /**
     * Mostra uma mensagem determinada e lê um carácter
     * @param msg Mensagem a ser colocada para o usuário
     * @return char
     * */
    public char lerChar(String msg) {
        if (entrada) {
            try {
                System.out.println(msg);
                caracter = tc.next().charAt(0);
                tc.nextLine();
                return caracter;
            } catch (NullPointerException | StringIndexOutOfBoundsException e) {
                return "0".charAt(0);
            }
        } else {
            try {
                return JOptionPane.showInputDialog(msg).trim().charAt(0);
            } catch (NullPointerException | StringIndexOutOfBoundsException e) {
                return "0".charAt(0);
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada, lê um e-mail e retorna o e-mail se for válido ou null se for inválido
     * @return email ou null
     * */
    public String lerEmail() {
        if (entrada) {
            System.out.println("Digite seu E-mail: ");
            String email = tc.next();
            tc.nextLine();
            if (padrao_de_email.matcher(email).matches()) {
                return email;
            } else {
                return null;
            }
        } else {
            try {
                String email = JOptionPane.showInputDialog("Digite seu E-mail: ").trim();
                if (padrao_de_email.matcher(email).matches()) {
                    return email;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem determinada, lê um e-mail e retorna o e-mail se for válido ou null se for inválido
     * @param msg Mensagem a ser colocada para o usuário
     * @return email ou null
     * */
    public String lerEmail(String msg) {
        if (entrada) {
            System.out.println(msg);
            String email = tc.next();
            tc.nextLine();
            if (padrao_de_email.matcher(email).matches()) {
                return email;
            } else {
                return null;
            }
        } else {
            try {
                String email = JOptionPane.showInputDialog(msg).trim();
                if (padrao_de_email.matcher(email).matches()) {
                    return email;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada, lê um telefone e retorna o telefone se for válido ou null se for inválido
     * @return telefone ou null
     * */
    public String lerTelefone() {
        if (entrada) {
            System.out.println("Digite seu Telefone no padrão XX-XXXXXXXXX: ");
            String telefone = tc.next();
            tc.nextLine();
            if (padrao_de_telefone.matcher(telefone).matches()) {
                return telefone;
            } else {
                return null;
            }
        } else {
            try {
                String telefone = JOptionPane.showInputDialog("Digite seu Telefone no padrão XX-XXXXXXXXX: ").trim();
                if (padrao_de_telefone.matcher(telefone).matches()) {
                    return telefone;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem determinada, lê um telefone e retorna o telefone se for válido ou null se for inválido
     * @param msg Mensagem a ser colocada para o usuário
     * @return telefone ou null
     * */
    public String lerTelefone(String msg) {
        if (entrada) {
            System.out.println(msg);
            String telefone = tc.next();
            tc.nextLine();
            if (padrao_de_telefone.matcher(telefone).matches()) {
                return telefone;
            } else {
                return null;
            }
        } else {
            try {
                String telefone = JOptionPane.showInputDialog(msg).trim();
                if (padrao_de_telefone.matcher(telefone).matches()) {
                    return telefone;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada, lê uma data e retorna a data se for válida ou null se for inválida
     * @return data ou null
     * */
    public String lerData() {
        if (entrada) {
            System.out.println("Digite sua data no padrão DD/MM/AAAA: ");
            String data = tc.next();
            tc.nextLine();
            if (padrao_de_data.matcher(data).matches()) {
                return data;
            } else {
                return null;
            }
        } else {
            try {
                String data = JOptionPane.showInputDialog("Digite sua data no padrão DD/MM/AAAA: ").trim();
                if (padrao_de_data.matcher(data).matches()) {
                    return data;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem determinada, lê uma data e retorna a data se for válida ou null se for inválida
     * @param msg Mensagem a ser colocada para o usuário
     * @return data ou null
     * */
    public String lerData(String msg) {
        if (entrada) {
            System.out.println(msg);
            String data = tc.next();
            tc.nextLine();
            if (padrao_de_data.matcher(data).matches()) {
                return data;
            } else {
                return null;
            }
        } else {
            try {
                String data = JOptionPane.showInputDialog(msg).trim();
                if (padrao_de_data.matcher(data).matches()) {
                    return data;
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada, lê uma data no formato DD/MM/AAAA e troca para MM/DD/AAAA
     * @return data ou null
     * */
    public String trocarData() {
        if (entrada) {
            System.out.println("Digite uma data no padrão DD/MM/AAAA para trocar para MM/DD/AAAA: ");
            String data = tc.next();
            tc.nextLine();
            if (padrao_de_data.matcher(data).matches()) {
                return data.replaceFirst(String.valueOf(padrao_de_data), "$2/$1/$3");
            } else {
                return null;
            }
        } else {
            try {
                String data = JOptionPane.showInputDialog("Digite uma data no padrão DD/MM/AAAA para trocar para MM/DD/AAAA: ").trim();
                if (padrao_de_data.matcher(data).matches()) {
                    return data.replaceFirst(String.valueOf(padrao_de_data), "$2/$1/$3");
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem determinada, lê uma data no formato DD/MM/AAAA e troca para MM/DD/AAAA
     * @param msg Mensagem a ser colocada para o usuário
     * @return data ou null
     * */
    public String trocarData(String msg) {
        if (entrada) {
            System.out.println(msg);
            String data = tc.next();
            tc.nextLine();
            if (padrao_de_data.matcher(data).matches()) {
                return data.replaceFirst(String.valueOf(padrao_de_data), "$2/$1/$3");
            } else {
                return null;
            }
        } else {
            try {
                String data = JOptionPane.showInputDialog(msg).trim();
                if (padrao_de_data.matcher(data).matches()) {
                    return data.replaceFirst(String.valueOf(padrao_de_data), "$2/$1/$3");
                } else {
                    return null;
                }
            } catch (NullPointerException e) {
                return "0";
            }
        }
    }

    /**
     * Mostra uma mensagem predeterminada, lê uma string e retorna "É Numérico" se for um número ou "Não é numérico" se não for um número
     * @return String
     * */
    public String eNumerico() {
        if (entrada) {
            System.out.println("Digite um número: ");
            String numero = tc.next();
            tc.nextLine();
            try {
                Double.parseDouble(numero);
                return "É Numérico!";
            } catch (NumberFormatException E) {
                return "Não é numérico!";
            }
        } else {
            String numero = JOptionPane.showInputDialog("Digite um número: ");
            try {
                Double.parseDouble(numero);
                return "É Numérico!";
            } catch (NullPointerException e) {
                return "0";
            } catch (NumberFormatException E) {
                return "Não é numérico!";
            }
        }
    }

    /**
     * Mostra uma mensagem determinada, lê uma string e retorna "É Numérico" se for um número ou "Não é numérico" se não for um número
     * @param msg Mensagem a ser colocada para o usuário
     * @return String
     * */
    public String eNumerico(String msg) {
        if (entrada) {
            System.out.println(msg);
            String numero = tc.next();
            tc.nextLine();
            try {
                Double.parseDouble(numero);
                return "É Numérico!";
            } catch (NumberFormatException E) {
                return "Não é numérico!";
            }
        } else {
            String numero = JOptionPane.showInputDialog(msg);
            try {
                Double.parseDouble(numero);
                return "É Numérico!";
            } catch (NullPointerException e) {
                return "0";
            } catch (NumberFormatException E) {
                return "Não é numérico!";
            }
        }
    }

}
