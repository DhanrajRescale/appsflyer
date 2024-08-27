package vt;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00012\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", HttpUrl.FRAGMENT_ENCODE_SET, "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class a extends iu.k implements Function1<Object, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(1);
        this.f38307a = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Object obj) {
        if (obj == this.f38307a) {
            return "(this Collection)";
        }
        return String.valueOf(obj);
    }
}
