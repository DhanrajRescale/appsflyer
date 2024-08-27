package okhttp3.internal.publicsuffix;

import bv.e0;
import bv.u;
import d4.t1;
import hl.f;
import iu.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jr.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.j;
import kotlin.text.w;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import pu.b;
import pu.c;
import vt.g0;
import vt.i0;
import vt.x;
import yk.g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", HttpUrl.FRAGMENT_ENCODE_SET, "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", HttpUrl.FRAGMENT_ENCODE_SET, "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';

    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] WILDCARD_LABEL = {42};

    @NotNull
    private static final List<String> PREVAILING_RULE = x.a("*");

    @NotNull
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();

    @NotNull
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    @NotNull
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EXCEPTION_MARKER", HttpUrl.FRAGMENT_ENCODE_SET, "PREVAILING_RULE", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", HttpUrl.FRAGMENT_ENCODE_SET, "labelIndex", HttpUrl.FRAGMENT_ENCODE_SET, "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int and;
            boolean z10;
            int and2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        and = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        and = Util.and(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    and2 = and - Util.and(bArr[i14 + i19], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length == i18) {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    } else {
                        z11 = z10;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String str2;
        String str3;
        List<String> list;
        List<String> list2;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            int size = domainLabels.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                String str4 = domainLabels.get(i10);
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = str4.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                str = null;
                if (i11 < size) {
                    Companion companion = INSTANCE;
                    byte[] bArr2 = this.publicSuffixListBytes;
                    if (bArr2 != null) {
                        str2 = companion.binarySearch(bArr2, bArr, i11);
                        if (str2 != null) {
                            break;
                        }
                        i11++;
                    } else {
                        Intrinsics.k("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i12 = 0; i12 < length; i12++) {
                    bArr3[i12] = WILDCARD_LABEL;
                    Companion companion2 = INSTANCE;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 != null) {
                        str3 = companion2.binarySearch(bArr4, bArr3, i12);
                        if (str3 != null) {
                            break;
                        }
                    } else {
                        Intrinsics.k("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i13 = size - 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        break;
                    }
                    Companion companion3 = INSTANCE;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 != null) {
                        String binarySearch = companion3.binarySearch(bArr5, bArr, i14);
                        if (binarySearch != null) {
                            str = binarySearch;
                            break;
                        }
                        i14++;
                    } else {
                        Intrinsics.k("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            if (str != null) {
                return w.O("!".concat(str), new char[]{'.'});
            }
            if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            }
            if (str2 == null || (list = w.O(str2, new char[]{'.'})) == null) {
                list = i0.f38321a;
            }
            if (str3 == null || (list2 = w.O(str3, new char[]{'.'})) == null) {
                list2 = i0.f38321a;
            }
            if (list.size() <= list2.size()) {
                return list2;
            }
            return list;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void readTheList() throws IOException {
        try {
            z zVar = new z();
            z zVar2 = new z();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                return;
            }
            e0 v10 = f.v(new u(f.Z0(resourceAsStream)));
            try {
                long readInt = v10.readInt();
                v10.W(readInt);
                zVar.f20560a = v10.f7341b.x(readInt);
                long readInt2 = v10.readInt();
                v10.W(readInt2);
                zVar2.f20560a = v10.f7341b.x(readInt2);
                Unit unit = Unit.f23355a;
                g.k(v10, null);
                synchronized (this) {
                    Object obj = zVar.f20560a;
                    Intrinsics.c(obj);
                    this.publicSuffixListBytes = (byte[]) obj;
                    Object obj2 = zVar2.f20560a;
                    Intrinsics.c(obj2);
                    this.publicSuffixExceptionListBytes = (byte[]) obj2;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String domain) {
        int i10 = 0;
        List<String> O = w.O(domain, new char[]{'.'});
        if (Intrinsics.a(g0.C(O), HttpUrl.FRAGMENT_ENCODE_SET)) {
            Intrinsics.checkNotNullParameter(O, "<this>");
            int size = O.size() - 1;
            if (size >= 0) {
                i10 = size;
            }
            return g0.N(O, i10);
        }
        return O;
    }

    public final String getEffectiveTldPlusOne(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicodeDomain);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        int i10 = 0;
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i11 = size - size2;
        List<String> splitDomain2 = splitDomain(domain);
        Intrinsics.checkNotNullParameter(splitDomain2, "<this>");
        Sequence t1Var = new t1(splitDomain2, 2);
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        if (i11 >= 0) {
            if (i11 != 0) {
                if (t1Var instanceof c) {
                    t1Var = ((c) t1Var).a(i11);
                } else {
                    t1Var = new b(t1Var, i11);
                }
            }
            Intrinsics.checkNotNullParameter(t1Var, "<this>");
            Intrinsics.checkNotNullParameter(".", "separator");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "prefix");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            StringBuilder buffer = new StringBuilder();
            Intrinsics.checkNotNullParameter(t1Var, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(".", "separator");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "prefix");
            Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            buffer.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            for (Object obj : t1Var) {
                i10++;
                if (i10 > 1) {
                    buffer.append((CharSequence) ".");
                }
                j.a(buffer, obj, null);
            }
            buffer.append((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET);
            String sb2 = buffer.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException(h.o("Requested element count ", i11, " is less than zero.").toString());
    }

    public final void setListBytes(@NotNull byte[] publicSuffixListBytes, @NotNull byte[] publicSuffixExceptionListBytes) {
        Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
