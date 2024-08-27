package wl;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum d {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");


    /* renamed from: a, reason: collision with root package name */
    public final String f39166a;

    d(String str) {
        this.f39166a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 4);
    }
}
