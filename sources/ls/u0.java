package ls;

/* loaded from: classes2.dex */
public enum u0 {
    HOMESCREEN("homescreen"),
    URL_IN_BROWSER("browser"),
    /* JADX INFO: Fake field, exist only in values array */
    DEEP_LINK("deeplink"),
    ERROR("error");


    /* renamed from: a, reason: collision with root package name */
    public final String f25307a;

    u0(String str) {
        this.f25307a = str;
    }

    public static u0 a(String str) {
        for (u0 u0Var : values()) {
            if (u0Var.f25307a.equals(str)) {
                return u0Var;
            }
        }
        return ERROR;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25307a;
    }
}
