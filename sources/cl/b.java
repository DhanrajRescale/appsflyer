package cl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f8207a = {new Enum("MANUAL", 0), new Enum("INFERENCE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    public static b valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (b) Enum.valueOf(b.class, value);
    }

    public static b[] values() {
        return (b[]) Arrays.copyOf(f8207a, 2);
    }
}
