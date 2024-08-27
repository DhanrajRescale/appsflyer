package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0002\u000e\rB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", HttpUrl.FRAGMENT_ENCODE_SET, "input", HttpUrl.FRAGMENT_ENCODE_SET, "replacement", "replace", "pattern", "<init>", "(Ljava/lang/String;)V", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class Regex implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f23392a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00052\u00060\u0001j\u0002`\u0002:\u0001\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lkotlin/text/Regex$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final String f23394a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23395b;

        public b(String pattern, int i10) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f23394a = pattern;
            this.f23395b = i10;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f23394a, this.f23395b);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
            return new Regex(compile);
        }
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f23392a = nativePattern;
    }

    public static pu.q a(Regex regex, CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() >= 0) {
            g seedFunction = new g(regex, input, 0);
            h nextFunction = h.f23415i;
            Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
            Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
            return new pu.q(seedFunction, nextFunction);
        }
        StringBuilder n10 = a3.a.n("Start index out of bounds: ", 0, ", input length: ");
        n10.append(input.length());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    private final Object writeReplace() {
        Pattern pattern = this.f23392a;
        String pattern2 = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern2, "pattern(...)");
        return new b(pattern2, pattern.flags());
    }

    public final f b(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f23392a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (!matcher.matches()) {
            return null;
        }
        return new f(matcher, input);
    }

    public final boolean c(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f23392a.matcher(input).matches();
    }

    public final List d(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i10 = 0;
        w.M(0);
        Matcher matcher = this.f23392a.matcher(input);
        if (!matcher.find()) {
            return vt.x.a(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(i10, matcher.start()).toString());
            i10 = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(i10, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f23392a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f23392a.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }
}
