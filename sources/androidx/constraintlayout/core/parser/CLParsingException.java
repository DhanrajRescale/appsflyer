package androidx.constraintlayout.core.parser;

import f3.c;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f1442a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1443b;

    public CLParsingException(String str, c cVar) {
        super(str);
        this.f1442a = str;
        if (cVar != null) {
            this.f1443b = cVar.i();
        } else {
            this.f1443b = "unknown";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CLParsingException (");
        sb2.append(hashCode());
        sb2.append(") : ");
        sb2.append(this.f1442a + " (" + this.f1443b + " at line 0)");
        return sb2.toString();
    }
}
