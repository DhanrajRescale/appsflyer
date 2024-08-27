package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/text/MatchGroup;", "a", "(I)Lkotlin/text/MatchGroup;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class d extends iu.k implements Function1<Integer, MatchGroup> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f23406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f23406a = eVar;
    }

    public final MatchGroup a(int i10) {
        return this.f23406a.e(i10);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
