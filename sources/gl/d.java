package gl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f17461a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f17462b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f17463c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gl.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gl.d] */
    static {
        ?? r02 = new Enum("MOBILE_INSTALL_EVENT", 0);
        f17461a = r02;
        ?? r12 = new Enum("CUSTOM_APP_EVENTS", 1);
        f17462b = r12;
        f17463c = new d[]{r02, r12};
    }

    public static d valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (d) Enum.valueOf(d.class, value);
    }

    public static d[] values() {
        return (d[]) Arrays.copyOf(f17463c, 2);
    }
}
