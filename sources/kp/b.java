package kp;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final char f23428a;

    public b(char c10) {
        this.f23428a = c10;
    }

    @Override // kp.a
    public final boolean b(char c10) {
        return c10 == this.f23428a;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        char c10 = this.f23428a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
