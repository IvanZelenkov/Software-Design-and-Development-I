// Ivan Zelenkov Problem 8 (ASM Emulator)

public class ASMEmulator {

    private static int eax = 0;
    private static int ebx = 0;
    private static int ecx = 0;
    private static int edx = 0;

    private static int temp = 0;

    static void mov(String reg1, int val) {
        if(reg1.equals("eax")) {
            eax = val;
        }
        else if (reg1.equals("ebx")) {
            ebx = val;
        }
        else if (reg1.equals("ecx")) {
            ecx = val;
        }
        else if (reg1.equals("edx")) {
            edx = val;
        }
    }

    static void mov(String reg1, String reg2) {
        System.out.println("MOV ");
        if (reg1.equals("eax")) {
            temp = eax;
        }
        else if (reg1.equals("ebx")) {
            temp = ebx;
        }
        else if (reg1.equals("ecx")) {
            temp = ecx;
        }
        else if (reg1.equals("edx") ) {
            temp = edx;
        }
        else if (reg2.equals("eax")) {
            temp = eax;
        }
        else if (reg2.equals("ebx")) {
            temp = ebx;
        }
        else if (reg2.equals("ecx")) {
            temp = ecx;
        }
        else if (reg2.equals("edx")) {
            temp = edx;
        }
    }

    static void add(String reg1, int val) {
        if(reg1.equals("eax")) {
            eax += val;
        }
        else if (reg1.equals("ebx")) {
            ebx += val;
        }
        else if (reg1.equals("ecx")) {
            ecx += val;
        }
        else if (reg1.equals("edx")) {
            edx += val;
        }
    }

    static void add(String reg1, String reg2) {
        if (reg1.equals("eax")) {
            if (reg2.equals("eax")) temp = eax + eax;
            else if (reg2.equals("ebx")) temp = eax + ebx;
            else if (reg2.equals("ecx")) temp = eax + ecx;
            else if (reg2.equals("edx")) temp = eax + edx;
        }
        else if (reg1.equals("ebx")) {
            if (reg2.equals("eax")) temp = ebx + eax;
            else if (reg2.equals("ebx")) temp = ebx + ebx;
            else if (reg2.equals("ecx")) temp = ebx + ecx;
            else if (reg2.equals("edx")) temp = ebx + edx;
        }
        else if (reg1.equals("ecx")) {
            if (reg2.equals("eax")) temp = ecx + eax;
            else if (reg2.equals("ebx")) temp = ecx + ebx;
            else if (reg2.equals("ecx")) temp = ecx + ecx;
            else if (reg2.equals("edx")) temp = ecx + edx;
        }
        else if (reg1.equals("edx")) {
            if (reg2.equals("eax")) temp += edx + eax;
            else if (reg2.equals("ebx")) temp += edx + ebx;
            else if (reg2.equals("ecx")) temp += edx + ecx;
            else if (reg2.equals("edx")) temp += edx + edx;
        }
    }

    static void imul(String reg1, int val) {
        if(reg1.equals("eax")) {
            temp = temp * val;
        }
        else if (reg1.equals("ebx")) {
            temp = temp * val;
        }
        else if (reg1.equals("ecx")) {
            temp = temp * val;
        }
        else if (reg1.equals("edx")) {
            temp = temp * val;
        }
    }

    static void imul(String reg1, String reg2) {
        System.out.println("IMUL ");
        if (reg1.equals("eax")) {
            temp *= eax;
        }
        else if (reg1.equals("ebx")) {
            temp *= ebx;
        }
        else if (reg1.equals("ecx")) {
            temp *= ecx;
        }
        else if (reg1.equals("edx")) {
            temp *= edx;
        }
        else if (reg2.equals("eax")) {
            temp *= eax;
        }
        else if (reg2.equals("ebx")) {
            temp *= ebx;
        }
        else if (reg2.equals("ecx")) {
            temp *= ecx;
        }
        else if (reg2.equals("edx")) {
            temp *= edx;
        }
    }

    static void cmp(String reg1, int val) {
        if(reg1.equals("eax")) {
            if (val == temp) {
                temp = 1;
            }
            else {
                temp = 0;
            }
        }
        else if(reg1.equals("ebx")) {
            if (val == temp) {
                temp = 1;
            }
            else
                temp = 0;
        }
        else if(reg1.equals("ecx")) {
            if (val == temp) {
                temp = 1;
            }
            else
                temp = 0;
        }
        else if(reg1.equals("edx")) {
            if (edx == val) {
                temp = 1;
            }
            else
                temp = 0;
        }
    }

    static void cmp(String reg1, String reg2) {
        System.out.println("CMP ");
        if (reg1.equals("eax")) {
            if (reg1.equals(reg2)) {
                eax = 1;
            } else
                eax = 0;
        }
        else if (reg1.equals("ebx")) {
            if (reg1.equals(reg2)) {
                ebx = 1;
            } else
                ebx = 0;
        }
        else if (reg1.equals("ecx")) {
            if (reg1.equals(reg2)) {
                ecx = 1;
            } else
                ecx = 0;
        }
        else if (reg1.equals("edx")) {
            if (reg1.equals(reg2)) {
                edx = 1;
            } else
                edx = 0;
        }
    }

    static void call(String proc, String reg1) {
        if (proc.equals("PRINT") && reg1.equals("eax")) {
            System.out.println("[" + reg1 + "]: " + temp);
        }
        else if (proc.equals("PRINT") && reg1.equals("ebx")) {
            System.out.println("[" + reg1 + "]: " + temp);
        }
        else if (proc.equals("PRINT") && reg1.equals("ecx")) {
            System.out.println("[" + reg1 + "]: " + temp);
        }
        else if (proc.equals("PRINT") && reg1.equals("edx")) {
            System.out.println("[" + reg1 + "]: " + temp);
        }
    }
}



