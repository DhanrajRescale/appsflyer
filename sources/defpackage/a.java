package defpackage;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import e5.j;
import e5.l;
import i5.a1;
import i7.c;
import j5.w;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import n5.m;
import r3.k;
import tr.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f0a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3d;

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.f0a = i11;
        this.f2c = obj;
        this.f1b = i10;
        this.f3d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f0a;
        Object obj = this.f3d;
        int i11 = this.f1b;
        Object obj2 = this.f2c;
        switch (i10) {
            case 0:
                TextView this_truncateAndSet = (TextView) obj2;
                String text = (String) obj;
                Intrinsics.checkNotNullParameter(this_truncateAndSet, "$this_truncateAndSet");
                Intrinsics.checkNotNullParameter(text, "$text");
                if (this_truncateAndSet.getLineCount() > i11) {
                    CharSequence subSequence = this_truncateAndSet.getText().subSequence(0, this_truncateAndSet.getLayout().getLineEnd(i11 - 1) - 18);
                    SpannableString spannableString = new SpannableString(((Object) subSequence) + " Read more....");
                    spannableString.setSpan(new StyleSpan(1), subSequence.length(), spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(k.getColor(this_truncateAndSet.getContext(), R.color.primaryButtonColor)), subSequence.length(), spannableString.length(), 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(16, true), subSequence.length(), spannableString.length(), 33);
                    this_truncateAndSet.setText(spannableString);
                    this_truncateAndSet.setLines(i11);
                    this_truncateAndSet.setVisibility(0);
                    return;
                }
                this_truncateAndSet.setText(text);
                this_truncateAndSet.setVisibility(0);
                return;
            case 1:
                j jVar = (j) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    if (!lVar.f15024d) {
                        if (i11 != -1) {
                            lVar.f15022b.a(i11);
                        }
                        lVar.f15023c = true;
                        jVar.invoke(lVar.f15021a);
                    }
                }
                return;
            case 2:
                Pair pair = (Pair) obj;
                ((w) ((a1) ((e) obj2).f36362c).f19352h).j(((Integer) pair.first).intValue(), (r5.w) pair.second, i11);
                return;
            case 3:
                n5.l lVar2 = (n5.l) obj2;
                m mVar = (m) obj;
                lVar2.getClass();
                mVar.getClass();
                mVar.j(lVar2.f28314a, lVar2.f28315b, i11);
                return;
            case 4:
                ((i7.a) obj2).f19695b.h(i11, obj);
                return;
            default:
                ((c) obj2).h(i11, obj);
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10, int i11) {
        this.f0a = i11;
        this.f2c = obj;
        this.f3d = obj2;
        this.f1b = i10;
    }
}
