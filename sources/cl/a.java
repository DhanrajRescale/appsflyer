package cl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f8206a = {new Enum("CLICK", 0), new Enum("SELECTED", 1), new Enum("TEXT_CHANGED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    public static a valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (a) Enum.valueOf(a.class, value);
    }

    public static a[] values() {
        return (a[]) Arrays.copyOf(f8206a, 3);
    }
}
