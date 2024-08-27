package kotlin.text;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class t extends iu.k implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ char[] f23419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23420b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(char[] cArr, boolean z10) {
        super(2);
        this.f23419a = cArr;
        this.f23420b = z10;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i10) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        int B = w.B(i10, $receiver, this.f23420b, this.f23419a);
        if (B < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(B), 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
