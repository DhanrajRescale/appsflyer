package defpackage;

/* renamed from: $r8$backportedMethods$utility$String$2$corelib$joinArray, reason: invalid class name */
/* loaded from: C:\Users\Admin\appsflyer\classes14.dex */
public /* synthetic */ class C$r8$backportedMethods$utility$String$2$corelib$joinArray {
    public static /* synthetic */ String join(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i10 = 1; i10 < charSequenceArr.length; i10++) {
                sb2.append(charSequence);
                sb2.append(charSequenceArr[i10]);
            }
        }
        return sb2.toString();
    }
}
