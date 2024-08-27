package n9;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class t extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j9.i f28530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, j9.i iVar, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f28530a = iVar;
        this.f28531b = context;
        this.f28532c = str;
        this.f28533d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new t(this.f28531b, this.f28530a, this.f28532c, this.f28533d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        for (p9.c font : this.f28530a.f21170e.values()) {
            Context context = this.f28531b;
            Intrinsics.checkNotNullExpressionValue(font, "font");
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.f28532c);
            String str = font.f30784a;
            String str2 = font.f30786c;
            sb2.append((Object) str);
            sb2.append(this.f28533d);
            try {
                Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), sb2.toString());
                try {
                    Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                    Intrinsics.checkNotNullExpressionValue(str2, "font.style");
                    int i10 = 0;
                    boolean s7 = kotlin.text.w.s(str2, "Italic", false);
                    boolean s10 = kotlin.text.w.s(str2, "Bold", false);
                    if (s7 && s10) {
                        i10 = 3;
                    } else if (s7) {
                        i10 = 2;
                    } else if (s10) {
                        i10 = 1;
                    }
                    if (typefaceWithDefaultStyle.getStyle() != i10) {
                        typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i10);
                    }
                    font.f30787d = typefaceWithDefaultStyle;
                } catch (Exception unused) {
                    w9.b.f38875a.getClass();
                }
            } catch (Exception unused2) {
                w9.b.f38875a.getClass();
            }
        }
        return Unit.f23355a;
    }
}
