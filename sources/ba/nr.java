package ba;

import android.view.View;
import com.assetgro.stockgro.widget.ChipView;
import com.google.android.material.chip.ChipGroup;

/* loaded from: classes.dex */
public abstract class nr extends m4.m {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5601v = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ChipView f5602s;

    /* renamed from: t, reason: collision with root package name */
    public final ChipView f5603t;

    /* renamed from: u, reason: collision with root package name */
    public final ChipGroup f5604u;

    public nr(Object obj, View view, ChipView chipView, ChipView chipView2, ChipGroup chipGroup) {
        super(obj, view, 0);
        this.f5602s = chipView;
        this.f5603t = chipView2;
        this.f5604u = chipGroup;
    }
}
