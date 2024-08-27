package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import yk.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/a;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class a implements Iterable<Character>, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final char f23376a;

    /* renamed from: b, reason: collision with root package name */
    public final char f23377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23378c = 1;

    public a(char c10, char c11) {
        this.f23376a = c10;
        this.f23377b = (char) g.B(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new nu.a(this.f23376a, this.f23377b, this.f23378c);
    }
}
