package ls;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f25299a;

    public t(v vVar) {
        this.f25299a = vVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (f11 > s0.g.f34069a) {
            v.a(this.f25299a);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        JSONObject jSONObject;
        v vVar = this.f25299a;
        h0 h0Var = (h0) vVar.f25313f.f25182a;
        String str = h0Var.f25220l;
        JSONObject jSONObject2 = null;
        if (str != null && str.length() > 0) {
            try {
                Uri parse = Uri.parse(str);
                try {
                    vVar.f25309b.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (ActivityNotFoundException unused) {
                    el.l.l0("MixpanelAPI.InAppFrag", "User doesn't have an activity for notification URI " + parse);
                }
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException unused2) {
                }
                try {
                    jSONObject.put("url", str);
                    jSONObject2 = jSONObject;
                } catch (JSONException unused3) {
                    jSONObject2 = jSONObject;
                    el.l.M("MixpanelAPI.InAppFrag", "Can't put url into json properties");
                    vVar.f25308a.f25263e.i("$campaign_open", h0Var, jSONObject2);
                    v.a(vVar);
                    return true;
                }
            } catch (IllegalArgumentException e10) {
                el.l.m0("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", e10);
                return true;
            }
        }
        vVar.f25308a.f25263e.i("$campaign_open", h0Var, jSONObject2);
        v.a(vVar);
        return true;
    }
}
