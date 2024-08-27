package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class u extends iu.k implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f23421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(List list, boolean z10) {
        super(2);
        this.f23421a = list;
        this.f23422b = z10;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i10) {
        Object obj;
        Pair pair;
        Object obj2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        boolean z10 = this.f23422b;
        List list = this.f23421a;
        if (!z10 && list.size() == 1) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(list, "<this>");
            int size = list.size();
            if (size != 0) {
                if (size == 1) {
                    String str = (String) list.get(0);
                    int A = w.A($receiver, str, i10, false, 4);
                    if (A >= 0) {
                        pair = new Pair(Integer.valueOf(A), str);
                    }
                    pair = null;
                } else {
                    throw new IllegalArgumentException("List has more than one element.");
                }
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            kotlin.ranges.c cVar = new kotlin.ranges.c(i10, $receiver.length(), 1);
            boolean z11 = $receiver instanceof String;
            int i11 = cVar.f23383c;
            int i12 = cVar.f23382b;
            if (z11) {
                if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String str2 = (String) obj2;
                                if (s.l(0, i10, str2.length(), str2, (String) $receiver, z10)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 != null) {
                            pair = new Pair(Integer.valueOf(i10), str3);
                            break;
                        }
                        if (i10 == i12) {
                            break;
                        }
                        i10 += i11;
                    }
                }
                pair = null;
            } else {
                if ((i11 > 0 && i10 <= i12) || (i11 < 0 && i12 <= i10)) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                String str4 = (String) obj;
                                if (w.J(str4, 0, $receiver, i10, str4.length(), z10)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            pair = new Pair(Integer.valueOf(i10), str5);
                            break;
                        }
                        if (i10 == i12) {
                            break;
                        }
                        i10 += i11;
                    }
                }
                pair = null;
            }
        }
        if (pair == null) {
            return null;
        }
        return new Pair<>(pair.f23353a, Integer.valueOf(((String) pair.f23354b).length()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((CharSequence) obj, ((Number) obj2).intValue());
    }
}
