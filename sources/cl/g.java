package cl;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8225a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f8226b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public static Method f8227c;

    public static final ArrayList a(View view) {
        int childCount;
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i10));
                    if (i11 >= childCount) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0064, code lost:
    
        if (d4.y.class.isInstance(r3) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:82:0x0069, B:15:0x006c, B:17:0x0070, B:19:0x0076, B:21:0x007c, B:22:0x008c, B:24:0x0090, B:27:0x007f, B:29:0x0083, B:31:0x0093, B:33:0x0097, B:36:0x009c, B:38:0x00a0, B:40:0x00a4, B:42:0x00a8, B:44:0x00ab, B:46:0x00af, B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:30:0x005b, B:71:0x0060, B:79:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:30:0x005b, B:71:0x0060, B:79:0x0041, B:75:0x003b), top: B:54:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.g.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f8226b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a10 = a(view);
                int size = a10.size() - 1;
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        jSONArray.put(c((View) a10.get(i10)));
                        if (i11 > size) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e("cl.g", "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            if (sl.a.b(g.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    return (View.OnTouchListener) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
            } catch (ClassNotFoundException e10) {
                n0.E("cl.g", e10);
                return null;
            } catch (IllegalAccessException e11) {
                n0.E("cl.g", e11);
                return null;
            } catch (NoSuchFieldException e12) {
                n0.E("cl.g", e12);
                return null;
            }
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence charSequence;
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return obj;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (sl.a.b(g.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i10 = 0;
                if (view instanceof DatePicker) {
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i10);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            }
                            if (i11 >= childCount) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return obj;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public static final void m(View view, JSONObject json) {
        if (sl.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i10 = i(view);
                String g10 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", b(view));
                json.put("id", view.getId());
                if (!f.b(view)) {
                    json.put("text", n0.f(n0.U(i10)));
                } else {
                    json.put("text", HttpUrl.FRAGMENT_ENCODE_SET);
                    json.put("is_user_input", true);
                }
                json.put("hint", n0.f(n0.U(g10)));
                if (tag != null) {
                    json.put("tag", n0.f(n0.U(tag.toString())));
                }
                if (contentDescription != null) {
                    json.put("description", n0.f(n0.U(contentDescription.toString())));
                }
                json.put("dimension", f8225a.d(view));
            } catch (JSONException e10) {
                n0.E("cl.g", e10);
            }
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
        }
    }

    public final JSONObject d(View view) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e("cl.g", "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final View j(View view, float[] fArr) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f8227c;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke != null) {
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                Object parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException e10) {
                    n0.E("cl.g", e10);
                } catch (InvocationTargetException e11) {
                    n0.E("cl.g", e11);
                }
            }
            return null;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void k() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            if (f8227c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f8227c = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException e10) {
                n0.E("cl.g", e10);
            } catch (NoSuchMethodException e11) {
                n0.E("cl.g", e11);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public final boolean l(View view, View view2) {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!sl.a.b(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
            View j10 = j(view2, fArr);
            if (j10 == null) {
                return false;
            }
            if (j10.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th3) {
            sl.a.a(this, th3);
            return false;
        }
    }
}
