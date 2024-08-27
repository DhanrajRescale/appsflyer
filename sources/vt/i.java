package vt;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "it", HttpUrl.FRAGMENT_ENCODE_SET, "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class i extends iu.k implements Function1<Map.Entry<Object, Object>, CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f38320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(1);
        this.f38320a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CharSequence invoke(Map.Entry<Object, Object> it) {
        String valueOf;
        Intrinsics.checkNotNullParameter(it, "it");
        g.Companion companion = g.INSTANCE;
        g gVar = this.f38320a;
        gVar.getClass();
        StringBuilder sb2 = new StringBuilder();
        Object key = it.getKey();
        String str = "(this Map)";
        if (key == gVar) {
            valueOf = "(this Map)";
        } else {
            valueOf = String.valueOf(key);
        }
        sb2.append(valueOf);
        sb2.append('=');
        Object value = it.getValue();
        if (value != gVar) {
            str = String.valueOf(value);
        }
        sb2.append(str);
        return sb2.toString();
    }
}
