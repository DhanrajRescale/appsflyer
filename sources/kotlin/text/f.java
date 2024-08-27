package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vt.q0;

/* loaded from: classes2.dex */
public final class f implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f23408a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f23409b;

    /* renamed from: c, reason: collision with root package name */
    public final e f23410c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f23411d;

    public f(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f23408a = matcher;
        this.f23409b = input;
        this.f23410c = new e(this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.f23411d == null) {
            this.f23411d = new q0(this);
        }
        q0 q0Var = this.f23411d;
        Intrinsics.c(q0Var);
        return q0Var;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.f23408a;
        return kotlin.ranges.d.k(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final f next() {
        int i10;
        Matcher matcher = this.f23408a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = end + i10;
        CharSequence charSequence = this.f23409b;
        if (i11 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        if (!matcher2.find(i11)) {
            return null;
        }
        return new f(matcher2, charSequence);
    }
}
