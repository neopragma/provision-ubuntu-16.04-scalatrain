# provision-ubuntu-16.04-javatrain

Script to provision an instance of Ubuntu 16.04 Desktop as a Java programming training environment.

On a fresh Ubuntu instance:

<h3>1. Install git</h3>

```shell
sudo apt -y install git
```

<h3>2. Clone this repository</h3>

```shell
git clone http://github.com/neopragma/provision-ubuntu-16.04-javatrain
```

<h3>3. Change to the repo directory and run the setup Script</h3>

```shell
cd provision-ubuntu-16.04-javatrain
./setup
```

<h3>4. Complete manual configuration steps</h3>

Consult the ```help.html``` file to see how to complete the installation and configuration of the environment. The ```setup``` script copies that file to the Desktop folder of the Ubuntu instance.
