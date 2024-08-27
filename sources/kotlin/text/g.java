package kotlin.text;

import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/MatchResult;", "a", "()Lkotlin/text/MatchResult;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g extends iu.k implements Function0<MatchResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Regex f23412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f23413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Regex regex, CharSequence charSequence, int i10) {
        super(0);
        this.f23412a = regex;
        this.f23413b = charSequence;
        this.f23414c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MatchResult mo2invoke() {
        Regex regex = this.f23412a;
        regex.getClass();
        CharSequence input = this.f23413b;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = regex.f23392a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (!matcher.find(this.f23414c)) {
            return null;
        }
        return new f(matcher, input);
    }
}
