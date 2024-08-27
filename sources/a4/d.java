package a4;

import android.app.Activity;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.google.android.gms.common.api.Api;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import d4.n1;
import d4.w0;
import ek.h0;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f164c;

    public d(e eVar, Activity activity) {
        this.f163b = eVar;
        this.f164c = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        int i10 = this.f162a;
        KeyEvent.Callback callback = this.f164c;
        switch (i10) {
            case 0:
                if (c.B(view2)) {
                    e eVar = (e) this.f163b;
                    SplashScreenView child = c.n(view2);
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(child, "child");
                    build = b.b().build();
                    Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    rootView = child.getRootView();
                    if (build == rootView.computeSystemWindowInsets(build, rect)) {
                        rect.isEmpty();
                    }
                    ((ViewGroup) ((Activity) callback).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                    return;
                }
                return;
            default:
                ChipGroup chipGroup = (ChipGroup) callback;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    if (view2.getId() == -1) {
                        WeakHashMap weakHashMap = n1.f13788a;
                        view2.setId(w0.a());
                    }
                    l7.g gVar = chipGroup.f11258h;
                    Chip chip = (Chip) view2;
                    ((Map) gVar.f24117c).put(Integer.valueOf(chip.getId()), chip);
                    if (chip.isChecked()) {
                        gVar.a(chip);
                    }
                    chip.setInternalOnCheckedChangeListener(new h0(gVar, 10));
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = (ViewGroup.OnHierarchyChangeListener) this.f163b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    return;
                }
                return;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f162a) {
            case 0:
                return;
            default:
                ChipGroup chipGroup = (ChipGroup) this.f164c;
                if (view == chipGroup && (view2 instanceof Chip)) {
                    l7.g gVar = chipGroup.f11258h;
                    Chip chip = (Chip) view2;
                    gVar.getClass();
                    chip.setInternalOnCheckedChangeListener(null);
                    ((Map) gVar.f24117c).remove(Integer.valueOf(chip.getId()));
                    ((Set) gVar.f24118d).remove(Integer.valueOf(chip.getId()));
                }
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = (ViewGroup.OnHierarchyChangeListener) this.f163b;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    return;
                }
                return;
        }
    }

    public d(ChipGroup chipGroup) {
        this.f164c = chipGroup;
    }

    public /* synthetic */ d(ChipGroup chipGroup, int i10) {
        this(chipGroup);
    }
}
