package lu;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llu/d;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final d f25398b = cu.c.f13078a.b();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llu/d$a;", "Llu/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "defaultRandom", "Llu/d;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lu.d$a, reason: from kotlin metadata */
    /* loaded from: classes2.dex */
    public static final class Companion extends d implements Serializable {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llu/d$a$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lu.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0013a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0013a f25399a = new Object();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return d.INSTANCE;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final Object writeReplace() {
            return C0013a.f25399a;
        }

        @Override // lu.d
        public final int a(int i10) {
            return d.f25398b.a(i10);
        }

        @Override // lu.d
        public final int b() {
            return d.f25398b.b();
        }

        @Override // lu.d
        public final int c(int i10) {
            return d.f25398b.c(i10);
        }

        @Override // lu.d
        public final int d(int i10, int i11) {
            return d.f25398b.d(i10, i11);
        }
    }

    public abstract int a(int i10);

    public int b() {
        return a(32);
    }

    public int c(int i10) {
        return d(0, i10);
    }

    public int d(int i10, int i11) {
        int b10;
        int i12;
        int i13;
        if (i11 > i10) {
            int i14 = i11 - i10;
            if (i14 > 0 || i14 == Integer.MIN_VALUE) {
                if (((-i14) & i14) == i14) {
                    i13 = a(31 - Integer.numberOfLeadingZeros(i14));
                    return i10 + i13;
                }
                do {
                    b10 = b() >>> 1;
                    i12 = b10 % i14;
                } while ((i14 - 1) + (b10 - i12) < 0);
                i13 = i12;
                return i10 + i13;
            }
            while (true) {
                int b11 = b();
                if (i10 <= b11 && b11 < i11) {
                    return b11;
                }
            }
        } else {
            Integer from = Integer.valueOf(i10);
            Integer until = Integer.valueOf(i11);
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(until, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + from + ", " + until + ").").toString());
        }
    }
}
