package kl;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import cl.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vt.y;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23247a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final List f23248b = y.g(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (sl.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f23248b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = g.a(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (sl.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (sl.a.b(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String i10 = g.i(hostView);
            if (i10.length() > 0) {
                return i10;
            }
            String join = TextUtils.join(" ", f23247a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (sl.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i10 = g.i(view);
                String g10 = g.g(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", g.b(view));
                if (i10.length() > 0) {
                    json.put("text", i10);
                }
                if (g10.length() > 0) {
                    json.put("hint", g10);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = g.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i10 = g.i(view2);
                if (i10.length() > 0) {
                    arrayList.add(i10);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
