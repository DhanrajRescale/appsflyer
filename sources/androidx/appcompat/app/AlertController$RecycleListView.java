package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import g.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f890a;

    /* renamed from: b, reason: collision with root package name */
    public final int f891b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16368t);
        this.f891b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f890a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
