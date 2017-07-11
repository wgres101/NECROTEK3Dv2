package Physics.Smoothing.Ease_Out_Interpolation;

public class CEase_In_Out_Interpolation {


	float _value;
	float _target;
	float _speed;
	float _acceleration;
	float _remainingTime;
	float totalTime;
	
	public boolean Setup(float from, float to, float time)
	{
		
		_value  = from;
		_target = to;
		_speed = 0.0f;
		//derived from x=x0 + v0t + att/2
		_acceleration = (to-from)/(time*time/4);
		_remainingTime = time;
		totalTime = time;
		
		if (time<=0)
		{
			return false;
		}
		
		return true;
		
	}
	
	public boolean Interpolate(float deltaTime)
	{
		_remainingTime -= deltaTime;
		if (_remainingTime < totalTime/2)
		{
			//deceleration
			_speed -= _acceleration * deltaTime;
		}
		else
		{
			//acceleration
			_speed += _acceleration * deltaTime;
		}
		_value += _speed*deltaTime;
		return (_remainingTime <= 0);
		
		}
	
	float GetValue()
	{
		return _value;
	}
}
