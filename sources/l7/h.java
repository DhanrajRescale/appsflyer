package l7;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f24120a;

    public h(String[] strArr) {
        this.f24120a = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public boolean a() {
        return false;
    }

    public abstract void b(Set set);
}
