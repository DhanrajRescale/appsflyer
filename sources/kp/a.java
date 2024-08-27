package kp;

/* loaded from: classes2.dex */
public abstract class a implements h {
    public int a(int i10, CharSequence charSequence) {
        int length = charSequence.length();
        dp.b.T0(i10, length);
        while (i10 < length) {
            if (!b(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // kp.h
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c10);
}
