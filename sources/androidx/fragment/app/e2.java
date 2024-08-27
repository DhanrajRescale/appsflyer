package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f1678a;

    /* renamed from: b, reason: collision with root package name */
    public static final e2 f1679b;

    /* renamed from: c, reason: collision with root package name */
    public static final e2 f1680c;

    /* renamed from: d, reason: collision with root package name */
    public static final e2 f1681d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e2[] f1682e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.fragment.app.e2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.fragment.app.e2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.fragment.app.e2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.fragment.app.e2] */
    static {
        ?? r02 = new Enum("REMOVED", 0);
        f1678a = r02;
        ?? r12 = new Enum("VISIBLE", 1);
        f1679b = r12;
        ?? r22 = new Enum("GONE", 2);
        f1680c = r22;
        ?? r32 = new Enum("INVISIBLE", 3);
        f1681d = r32;
        f1682e = new e2[]{r02, r12, r22, r32};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) f1682e.clone();
    }

    public final void a(View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }
}
