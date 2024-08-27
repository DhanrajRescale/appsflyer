package vs;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f38294e = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                Intrinsics.e(context, "context");
                return;
            } else {
                Intrinsics.e(context, "context");
                super(context, attributeSet);
                return;
            }
        }
        Intrinsics.e(context, "context");
        super(context, attributeSet);
    }
}
