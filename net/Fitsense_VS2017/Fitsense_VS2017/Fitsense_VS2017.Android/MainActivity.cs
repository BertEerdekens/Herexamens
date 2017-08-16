using System;
using Robotics.Mobile.Core.Bluetooth.LE;
using Fitsense_VS2017.


using Android.App;
using Android.Content.PM;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace Fitsense_VS2017.Droid
{
	[Activity (Label = "Fitsense_VS2017", Icon = "@drawable/icon", Theme="@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
	public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
	{
		protected override void OnCreate (Bundle bundle)
		{
			TabLayoutResource = Resource.Layout.Tabbar;
			ToolbarResource = Resource.Layout.Toolbar; 

			base.OnCreate (bundle);
            

			global::Xamarin.Forms.Forms.Init (this, bundle);
			LoadApplication (new Fitsense_VS2017.App ());
		}

        public void SetAdaptor()
        {
            var rob = new Robotics.Mobile.Core.Bluetooth.LE.Adapter();
            App.SetAdaptor(rob);
        }
    }
}

